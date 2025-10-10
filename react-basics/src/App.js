import logo from './logo.svg';
import './App.css';
import Welcome from './components/Welcome';
import Greeting from './components/Greeting';
import { FirstComponent as FC,SecondComponent } from './components/MyComponent'
import MyComponent from './components/MyComponent';
import HelloWorld from './components/HelloWorld';
import Student from './components/Student';
import Employee from './components/Employee';
import User from './components/User';
import EventHandling from './components/EventHandling';
import ConditionRendering from './components/ConditionRendering';

function App() {

  const student = {
    firstName: "Rishabh",
    lastName: "Srivastava",
    email:  "rishabh@gmail.com"
  }

  return(
  <div className='App'>
    {/* <Greeting name = "Rishabh Srivastava"/>
  
     <Greeting name = "Ayush Srivastava"/>  

     <FC />
     <SecondComponent />
     <MyComponent/> */}
     {/* <HelloWorld /> */}
     {/* <Student 
     student = {student} /> */}
     <ConditionRendering />

  </div>
  );
}

export default App;
