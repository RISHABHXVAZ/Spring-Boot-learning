import { useState } from "react"

const ConditionRendering = () => {
    
    const [isLoggedIn, setIsLoggedIn] = useState(false)

    let message;
    if(isLoggedIn){
        message = <p>Welcome, User</p>
    }
    else{
        message = <p>Please Login!</p>
    }

    function LoginPressed(){
        if(isLoggedIn){}
        else setIsLoggedIn(true)

    }
    function LogOutPressed(){
        if(isLoggedIn){
            setIsLoggedIn(false)
        }
        else{}

    }

    return(
        <div>
            {message}
            <button onClick={LoginPressed}>Login</button>
            <br></br>
            <button onClick={LogOutPressed}>Logout</button>
        </div>
    )
}

export default ConditionRendering