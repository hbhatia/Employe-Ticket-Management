import axios from "axios";

class AuthenticationService{

    registerSuccessfulLogin(username,password){
        console.log('In Service');
        sessionStorage.setItem('authenticateUser',username);
    }
    logout(){
        sessionStorage.removeItem('authenticateUser')
    }
    isUserLoggedIn(){
        let user=sessionStorage.getItem('authenticateUser');
        if(null===user){
            return false;
        }
        else{
            return true;
        }
    }
    getLoggedInUser(){
        let user=sessionStorage.getItem('authenticateUser');
        if(user!=null){
            return user;
        }
        return '';
    }
    setUpAxiosInterceptor(){
        axios.interceptors.request.user(
            (config)=>{
                if(this.isUserLoggedIn()){
                    config.headers.authorization=''
                }
                return config;
            }
        )
    }
    createEmployee(employee){
        axios.post('http://localhost:8080/createEmployee/', employee);
    }
}

export default new AuthenticationService()