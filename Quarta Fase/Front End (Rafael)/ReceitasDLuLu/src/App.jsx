import React from "react"
import { useState } from 'react'

import './App.css'
import './components/CompReceita.css'
//import CompReceita from "./components/CompReceita"

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
             
                   
        </div>

        <div id="DivReceita">
            {divReceita}
        </div>
        
        
        <script src="Script.js"></script>
    </div>
    
    
  )
}


function CompReceita(){

  return(

      <div className="receita">
          <div className='DivTituloReceita'>
              <input placeholder='Titulo da Receita' className='InputTitulo' type="text" />
          </div>

          <div className='DivModoDePreparo'>
              <textarea placeholder='Modo de Preparo...' name="" className="InputModoDePreparo" cols="30" rows="10"></textarea>
          </div>

          <h1>Ingredientes</h1>

          <div className='DivIngredientes'>

              
                  <input placeholder='Nome do Ingrediente' type="text" />
             

              
                  <input placeholder='Quantidade' type="number" />
            

             
                  <select name="" id="">
                      <option value="Unidade">Unidade</option>
                      <option value="Kg">Kilograma</option>
                      <option value="Ml">Mililitro</option>
                  </select>
             
          </div>
          <div className='DivSalvarOuMais'>
              <div  className='DivSalvar'><h2>Salvar</h2></div>
          </div>

      </div>  
      
  )
      
}

export default App
