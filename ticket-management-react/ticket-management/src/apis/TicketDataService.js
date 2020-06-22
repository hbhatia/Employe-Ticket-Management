import {Component} from 'react'
import axios from 'axios'
class TicketData extends Component{

    retriveAllDepartment(){
        return axios.get('http://localhost:8080/viewAllDepartment/');
    }

    retriveTicketByDepartmentName(deptName){
        console.log('Here it is '+ deptName);
        return axios.get(`http://localhost:8080/getAllTicketsByDepartmentName/${deptName}`);
    }

    createTicket(userTicket){
        return axios.post('http://localhost:8080/createUserTicket/', userTicket);
    }

    getAllSubmittedTickets(){
        return axios.get('http://localhost:8080/viewAllUserTickets');
    }
}

export default new TicketData();