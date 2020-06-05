import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  state = {
    isLoading: true,
    coffeeShops: []
  };

  async componentDidMount() {

    const response = await fetch('/api/coffee-shops');
    const body = await response.json();
    console.log(body._embedded.coffeeShops)
    this.setState({coffeeShops: body._embedded.coffeeShops, isLoading: false});
  }

  render () {
    const {coffeeShops, isLoading} = this.state
    if (isLoading) {
      return <p>Loading</p>
    }

    return (
      <div className="App">
        <header className="App-header">
          <div className="App-intro">
            <h2>Coffe Shop List</h2>
            { 
              coffeeShops.map(coffeeShop =>
                  <div key={coffeeShop.id}>
                    {coffeeShop.name} - {coffeeShop.address}
                  </div>
                )
            } 
          </div>
          
        </header>
      </div>
    );
  }
}

export default App;
