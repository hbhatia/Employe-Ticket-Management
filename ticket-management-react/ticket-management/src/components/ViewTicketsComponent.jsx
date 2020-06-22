import React ,{Component} from 'react'
import TicketDataService from '../apis/TicketDataService.js'
export default class ViewTicketsComponent extends Component{

    constructor(props){
        super(props);
        this.state={
            tickets:[]
        }
    }

    componentDidMount(){
        TicketDataService.getAllSubmittedTickets()
        .then((res)=>
            this.setState({
                tickets:res.data
            })
            //console.log(res.data)
            
        )
        
    }
    render(){
        return <div> 
            <h1>Tickets</h1>
                <div className="container">
                <table className="table">
                    <thead>
                        <tr>
                            <th>Department</th>
                            <th>Ticket Type</th>
                            <th>Ticket Subject</th>
                            <th>Ticket Priority</th>
                            <th>Ticket Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.tickets.map(
                                ticket=>
                                <tr key={ticket.id}>
                                    <td>{ticket.ticket.department.deptName}</td>
                                    <td>{ticket.ticket.ticketName}</td>
                                    <td>{ticket.subject}</td>
                                    <td>{ticket.ticketPriority}</td>
                                    <td>{ticket.ticketStatus}</td>
                                </tr>
                            )
                        }   
                    </tbody>
                </table>
                </div>
            </div>
        }
}