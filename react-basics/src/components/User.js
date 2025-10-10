import { useState } from "react"

const User = () => {

    const [firstName, setFirstName] = useState("Rishabh")
    const [lastName, setLastName] = useState("Srivastava")
    const [email, setEmail] = useState("Rishabh@mnnit.ac.in")

    function updateUser(){
        setFirstName("Ayush")
        setLastName("verma")
        setEmail("notary@gmail.com")
    }
    return(
        <div>
            <h1>User Details</h1>
            <p>{firstName}</p>
            <p>{lastName}</p>
            <p>{email}</p>
            <button onClick={updateUser}>Update User</button>
        </div>
    )

}

export default User