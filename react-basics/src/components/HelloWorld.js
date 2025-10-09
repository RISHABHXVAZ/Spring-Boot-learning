const HelloWorld = () => {
    function handleClick(){
        alert("Button clicked");
    }

    return <div><h1>Title</h1> 
    <h2>Sub Title</h2>
    <p>Paragraph</p>
    <button onClick={handleClick}>Click me</button>
    </div>
}

export default HelloWorld