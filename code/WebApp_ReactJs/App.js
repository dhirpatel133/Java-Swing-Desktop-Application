import './App.css'; 
import React from 'react';
import { BrowserRouter, Route, NavLink} from 'react-router-dom';
import Login from './Login';
import Meters from './meters';

 
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <div>
        <div className="header">
            <NavLink activeClassName="active" to="/login">Login</NavLink>
          </div>
          <div className="content">
            <switch>
              <Route exact path="/login" component={Login} />
              <Route exact path="/meters" component={Meters} />
            </switch>
          </div>
        </div>
      </BrowserRouter>
    </div>
  );
}
 
export default App;
