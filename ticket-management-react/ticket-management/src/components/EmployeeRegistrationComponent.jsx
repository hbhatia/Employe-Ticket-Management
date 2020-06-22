import React,{Component} from 'react'
import AuthenticationService from '../apis/AuthenticationService'
import { Formik, Form, Field, ErrorMessage } from 'formik';
class EmployeeRegistrationComponent extends Component{

    constructor(props) {
        super(props)

        this.state = {
            firstName:'',
            lastName: '',
            empEmail: ''
        }
        this.onSubmit = this.onSubmit.bind(this)
        this.validate = this.validate.bind(this)
    }

    validate(values) {
        let errors = {}
        if (!values.firstName || values.firstName.length<3) {
            errors.description = 'Enter FirstName of minimum 3 Character '
        } 
        if (!values.lastName || values.lastName.length<3) {
            errors.description = 'Enter LastName of minimum 3 Character '
        }
        // if (!values.empEmail.match(/^([\w.%+-]+)@([\w-]+\.)+([\w]{2,})$/i)) {
        //     errors.empEmail = 'Enter valid EmailId '
        // }
        return errors

    }

    onSubmit(values) {
        // let username = AuthenticationService.getLoggedInUser()

        let employee = {
            firstName: values.firstName,
            lastName: values.lastName,
            empEmail: values.empEmail
        }

        AuthenticationService.createEmployee(employee)
                .then((res) => this.props.history.push(`/createPassword/${res.data.empId}`))
        console.log(values);
    }

    render(){
        let { firstName, lastName,empEmail } = this.state
        return(
            <div>
                <h1>Registration</h1>
                <div className="container">
                <Formik
                        initialValues={{ firstName, lastName,empEmail }}
                        onSubmit={this.onSubmit}
                        validateOnChange={false}
                        validateOnBlur={false}
                        validate={this.validate}
                        enableReinitialize={true}
                    >
                        {
                            (props) => (
                                <Form>
                                    <ErrorMessage name="firstName" component="div"
                                        className="alert alert-warning" />
                                    <ErrorMessage name="lastName" component="div"
                                        className="alert alert-warning" />
                                    <ErrorMessage name="empEmail" component="div"
                                        className="alert alert-warning" />
                                    <fieldset className="form-group">
                                        <label>FirstName</label>
                                        <Field className="form-control" type="text" name="firstName" />
                                    </fieldset>
                                    <fieldset className="form-group">
                                        <label>LastName</label>
                                        <Field className="form-control" type="text" name="lastName" />
                                    </fieldset>
                                    <fieldset className="form-group">
                                        <label>Email ID</label>
                                        <Field className="form-control" type="email" name="empEmail" />
                                    </fieldset>
                                    <button className="btn btn-success" type="submit">Sign UP</button>
                                </Form>
                            )
                        }
                    </Formik>
                </div>
            </div>
        )
    }
}

export default EmployeeRegistrationComponent