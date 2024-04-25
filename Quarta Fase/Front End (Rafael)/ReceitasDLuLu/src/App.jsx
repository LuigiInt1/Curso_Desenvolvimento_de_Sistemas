import React from "react"
import { useState } from 'react'

import './App.css'
import CompReceita from "./components/CompReceita"

function App() {
  const [divReceita, setDivReceita] = useState()
  const [inpTitulo, setInpTitulo] = useState()

  function atualizarTitulo(event){
    setInpTitulo(event.target.value)
  }

  function criarReceita(){

    setDivReceita(<CompReceita/>)

  }

  return (
    <div id="container">

        <div id="top">
            <h1 id="TituloTop">RECEITAS DO LULU</h1>
        </div>

        <div id="input">

            <div  onClick = {criarReceita} id="BotaoCriarReceita"><h1 id="TextoCriarReceita">Criar Receita</h1></div>

            <input type = "string" 
              value = {inpTitulo}
              onChange = {atualizarTitulo}
              placeholder='Pesquise uma Receita'
            />
             {divReceita}
                   
        </div>

        <div id="DivReceita">

        </div>
        
        <script src="Script.js"></script>
    </div>
    
    
  )
}

export default App
