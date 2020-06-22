import React,{ Component } from "react";
import AuthenticationService from '../apis/AuthenticationService.js' 
import {Route,Redirect} from 'react-router-dom'

export default class AuthenticatedRoute extends Component{

    render(){
           if(AuthenticationService.isUserLoggedIn()) {
             return (<Route {...this.props}/>)   
           }
           else{
               console.log('Not Logged in')
             return (<Redirect to="/login/"/>)
           }
    }
}