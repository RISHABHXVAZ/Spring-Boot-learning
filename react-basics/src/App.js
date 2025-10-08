import logo from './logo.svg';
import './App.css';
import Welcome from './components/Welcome';

function App() {
  return(
  <div className='App'>
    <Welcome name = "Rishabh"/>
  
     <Welcome name = "Ayush"/>  {/*reusabiltity */}
  </div>
  );
}

export default App;
