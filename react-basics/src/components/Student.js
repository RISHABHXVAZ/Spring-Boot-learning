const Student = (props) => {
    return(
        <div>
            <h1>Student Details</h1>
            <p>Student first name: {props.student.firstName}</p>
            <p>Student last name: {props.student.lastName}</p>
            <p>Student email: {props.student.email}</p>
        </div>
    )
}

export default Student