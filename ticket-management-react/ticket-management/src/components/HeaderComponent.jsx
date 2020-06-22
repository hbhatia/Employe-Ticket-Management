import React,{ Component } from "react";
import AuthenticationService from "../apis/AuthenticationService.js"
import {withRouter} from 'react-router'
import {Link} from 'react-router-dom'


class HeaderComponent extends Component{
    render(){
        console.log('In header Component');
        const loggedIn=AuthenticationService.isUserLoggedIn();
        console.log(loggedIn);
        return (
            <header>
                <nav className="navbar navbar-expand-md navbar-dark bg-dark">
                    <div className="navbar-brand">Employee Ticket Management</div>
                    <ul className="navbar-nav">
                        {!loggedIn && <li><Link className="nav-link" to="/createEmployee">Registration</Link></li>}
                        {/* {loggedIn && <li><Link className="nav-link" to="/todos">ToDos</Link></li>} */}
                    </ul>
                    <ul className="navbar-nav navbar-collapse justify-content-end">
                        {!loggedIn && <li><Link className="nav-link" to="/login">Login</Link></li>}
                        {loggedIn && <li><Link className="nav-link" to="/logout" onClick={AuthenticationService.logout}>Logout</Link></li>}
                    </ul>
                </nav>
            </header>
        );
    }
}
export default withRouter(HeaderComponent);