import React from 'react'
import Navbar from '../components/Navbar'
import { UsuariosContext } from '../contexts/GlobalContext'
import { useContext } from 'react'


function Home() {
  const {autor} = useContext(UsuariosContext)   
  return (
    <div>
        <h1>Home Baby</h1>
        <p>Nome do Auroe: {autor}</p>
    </div>
  )
}

export default Home
