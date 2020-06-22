import React,{Component} from 'react';
import TicketDataService from '../apis/TicketDataService.js'
// import moment from 'moment'

export default class CreateTicketComponent extends Component{

    constructor(props){
        super(props)
        //Commeting for loading Todo from backend using componentDidMount Method
        this.state={
            department:'',
            ticket:'',
            departments:[],
            tickets:[],
            subject:''
        }
        this.handleDepartment=this.handleDepartment.bind(this);
        this.handleTicket=this.handleTicket.bind(this);
        this.handleSubjectChange=this.handleSubjectChange.bind(this);
        this.handleTicketSubmit=this.handleTicketSubmit.bind(this);
        this.validateInput=this.validateInput.bind(this);
    } 
    componentDidMount(){
        TicketDataService.retriveAllDepartment()
        .then((res)=>this.setState({
            departments:res.data,
            department:res.data[0].deptName
            })
        );
        
    }
    handleDepartment(event){
        console.log(event);
        console.log(event.target.value);
        this.setState({
            department:event.target.value
        })
        TicketDataService.retriveTicketByDepartmentName(event.target.value)
        .then(res=>this.setState({
            tickets:res.data,
            ticket:res.data[0].ticketName
        }));
    }
    handleTicket(event){
        this.setState({
            ticket:event.target.value
        })
    }
    handleSubjectChange(event){
        this.setState({
            subject:event.target.value
        })
    }

    handleTicketSubmit(){
        let isValidInput=this.validateInput();
        if(isValidInput){
            var userTicket={
                ticketStatus:'OPEN',
                ticketPriority:'URGENT',
                subject:this.state.subject,
                ticketName:this.state.ticket
            }
            console.log(userTicket);
            TicketDataService.createTicket(userTicket)
            .then((res) => console.log(res)
                )
        }
    }
    validateInput(){
        if(this.state.ticket.length>0 && this.state.department.length>0){
            console.log('valid input')
            return true;
        }
        return false;
    }

    render(){
    return <div> 
        <h1 className="">Create a Ticket</h1>
            <div className="container">
                Please Select a Department:
            <select value={this.state.department} onChange={this.handleDepartment}>
                {this.state.departments.map((dept)=>
                <option key={dept.deptId}>
                    {dept.deptName}
                </option>)}
            </select>
            </div>
            <div className="container">
                Please Select a Ticket:
            <select value={this.state.ticket} onChange={this.handleTicket}>
                {this.state.tickets.map((ticket)=>
                <option key={ticket.ticketId}>
                    {ticket.ticketName}
                </option>)}
            </select>
            </div>
            <div className="container">
            Department : {this.state.department}
            </div>
            <div className="container">
            Ticket : {this.state.ticket} 
            </div>       
            <div className="container">
                Subject:<textarea name='textarea' value={this.state.subject} onChange={this.handleSubjectChange}></textarea>
            </div>
            <button className="btn btn-success" type="submit" onClick={this.handleTicketSubmit}> Submit</button>
        </div>
    }
}