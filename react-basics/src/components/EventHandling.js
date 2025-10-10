import { useState } from "react"

const EventHandling = () => {

    const [count, setCount] = useState(0)

    function updateCount(){
        setCount(count + 1)
    }

    function resetCount(){
        setCount(0);
    }
    return(
        <div>
            <h1>EventHandling Example</h1>
            <p>Count: {count}</p>
            <button onClick={updateCount}>Increment</button>
            <button onClick={resetCount}>Reset</button>
        </div>
    )
}

export default EventHandling