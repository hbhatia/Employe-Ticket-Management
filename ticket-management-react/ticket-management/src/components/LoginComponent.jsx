import React,{Component} from 'react'
import AuthenticationService from '../apis/AuthenticationService.js'

export default class LoginComponent extends Component{
    
    handleValueChange(event){
        //console.log(this.state)
        this.setState({
            [event.target.name]:event.target.value
        })
    }

    constructor(props)
    {
        super(props)
        this.state={
            username:'',
            password:'',
            isLoginSuccess:false
        }
        this.handleValueChange=this.handleValueChange.bind(this)
        this.loginClicked=this.loginClicked.bind(this)
        
    }
    
    loginClicked(){
        if(this.state.username==='harsh' && this.state.password==='harsh'){
            AuthenticationService.registerSuccessfulLogin(this.state.username,this.state.password);
            this.props.history.push(`/welcome/${this.state.username}`)
            this.setState({
                isLoginSuccess:true
            })  
        }
        else{
            this.setState({
                isLoginSuccess:false
            })
        }
        
        console.log(this.state);
    }
    
    render(){
        return(
            <div>
                <h1> Login</h1>
                <div className="container">
                    {this.state.isLoginSuccess && <div className="alert alert-warning">Invalid  Succesfull</div>}
                </div>
                <div className="container">
                    UserName:<input type="text" name="username" value={this.state.username} onChange={this.handleValueChange}/>
                </div>
                <div className="container">
                    Password:<input type="password" name="password" value={this.state.password} onChange={this.handleValueChange}/>
                </div>
                <button className="btn btn-success" onClick={this.loginClicked}> Login </button>
            </div>
        )
    }
}