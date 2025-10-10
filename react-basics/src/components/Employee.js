import React from "react";
class Employee extends React.Component{

    constructor(props){
        super(props)
        this.state = {
            firstName: "Rishabh",
            lastName: "Srivastava",
            email: "rishabh@gmail.com"
        }
    }

    updateEmployee(){
        this.setState({
            firstName: "Ayush",
            lastName: "Jindal",
            email: "ayush99@gmail.com"
        })
    }
     restoreEmployee(){
        this.setState({
            firstName: "Rishabh",
            lastName: "Srivastava",
            email: "rishabh@gmail.com"
        })
    }

    render(){
        return(
            <div>
                <h1>Employee Details  </h1>
                <p>{this.state.firstName}</p>
                <p>{this.state.lastName}</p>
                <p>{this.state.email}</p>
                <button onClick={() => this.updateEmployee()}>Update Employee</button>
                <button onClick={() => this.restoreEmployee()}>Restore Employee</button>
            </div>
        );
    }
}

export default Employee