// import {Link} from 'react-router-dom'
import React,{Component} from 'react'
import TicketDataService from '../apis/TicketDataService';
// import HelloWorldService from '../../../api/todo/HelloWorldService.js'
export default class WelcomeComponent extends Component{
    constructor(props){
        super(props);
        this.viewTicketsList=this.viewTicketsList.bind(this)
        this.submitTicket=this.submitTicket.bind(this)
        this.handleSuccessResponse=this.handleSuccessResponse.bind(this)
        this.state={
            welcomeMessage: ''
        }
    }
    render(){
        return (
            <>
            <h1> Welcome In Ticket Management</h1>
            <div className="container">
                Welcome {this.props.match.params.name} You can Manage your Tickets Here
            </div>
            <div className="container">
                <span className="container">
                <button onClick={this.viewTicketsList} className="btn btn-success" >View Tickets</button>
                <button onClick={this.submitTicket} className="btn btn-primary" >Submit Ticket</button>
                </span>
            </div>
            </>
        )
    }
    viewTicketsList(){
        TicketDataService.getAllSubmittedTickets()
        .then(
            this.props.history.push('/viewTickets/')
        )
    }
    submitTicket(){
        this.props.history.push('/createTicket/')
    }
    handleSuccessResponse(res){
        this.setState({
            welcomeMessage:res.data
        })
    }
}