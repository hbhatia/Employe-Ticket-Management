import React, {Component} from 'react';
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom'
import AuthenticatedRoute from './AuthenticatedRoute.jsx'
import LoginComponent from './LoginComponent'
import HeaderComponent from './HeaderComponent'
import WelcomeComponent from './WelcomeComponent'
import FooterComponent from './FooterComponent'
import LogOutComponent from './LogOutComponent'
// import ErrorComponent from './ErrorComponent'
import CreateTicketComponent from './CreateTicketComponent'
import ViewTicketsComponent from './ViewTicketsComponent'
import EmployeeRegistrationComponent from './EmployeeRegistrationComponent'
import UserRegistrationComponent from './UserRegistrationComponent'

export default class TicketManagementApp extends Component{
    
    render(){
        return(
            <div>
                <Router>
                    <>
                        <HeaderComponent/>
                        <Switch>
                            <Route path="/" exact component={LoginComponent}/>
                            <Route path="/login" component={LoginComponent}/>
                            <Route path="/createEmployee" component={EmployeeRegistrationComponent}/>
                            <Route path="/createUser" component={UserRegistrationComponent}/>
                            <AuthenticatedRoute path="/welcome/:name" component={WelcomeComponent}/>
                            <AuthenticatedRoute path="/viewTickets" component={ViewTicketsComponent}/>
                            <AuthenticatedRoute path="/createTicket" component={CreateTicketComponent}/>
                            <AuthenticatedRoute path="/logout" component={LogOutComponent}/>
                            {/* <Route component={ErrorComponent}/> */}
                        </Switch>
                        <FooterComponent/>
                    </>
                </Router>    
            </div>
        );
    }
}
