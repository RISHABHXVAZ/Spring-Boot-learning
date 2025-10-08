import logo from './logo.svg';
import './App.css';
import Welcome from './components/Welcome';
import Greeting from './components/Greeting';

function App() {
  return(
  <div className='App'>
    <Greeting name = "Rishabh Srivastava"/>
  
     <Greeting name = "Ayush Srivastava"/>  {/*reusabiltity */}
  </div>
  );
}

export default App;
