import React, {useState} from "react";

function Login(props) {

    const[username, setUsername] = useState('');
    const[password, setPassword] = useState('');
    const[loading, setLoading] = useState(false);
  
    const handleLogin = () => {
      props.history.push('/meters');
    }
  
    return (
      <div>
      <h1 style={{fontSize: 40, fontWeight: 'bold', paddingTop: 70, paddingLeft: '2%' }}>Login Page</h1>
      <div className="main">
          <div className="center">
            <p style={{fontSize: 23, fontWeight: 'bold', paddingTop: 70}}>Username</p>
              <input 
              style={{borderRadius: 10, height: 22}} 
              type="text"
              value={username}
              onChange={e => setUsername(e.target.value)}            
              />
          </div>
          <div className="center">
          <p style={{fontSize: 23, fontWeight: 'bold'}}>Password</p>
              <input 
              style={{borderRadius: 10, height: 22}} 
              type="text"
              value={password}
              onChange={e => setPassword(e.target.value)}
              />
          </div>
          <input 
          style={{fontSize: 20, marginTop: 15, borderRadius: 10}}
          type="button"
          value={loading ? "Loading..." : "Login"}
          onClick={handleLogin}
          />
      </div>
      </div>
  )
}

export default Login;