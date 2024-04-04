import { useState } from 'react'

import './App.css'
import RenderBooleano from './components/RenderBooleano'
import RenderCondicional from './components/RenderCondicional'
import RenderTernario from './components/RenderTernario'
import RenderTernarioFalso from './components/RenderTernarioFalso'
import RenderFuncaoTrue from './components/RenderFuncaoTrue'
import RenderFuncaoFalse from './components/RenderFuncaoFalse'


function App() {
  const [inpIdade, setInpIdade] = useState()
  const [estado, setEstado] = useState(true)

  function mudarEstado(){
    setEstado(!estado)
  }

  function atualizarIdade(event){
    setInpIdade(event.target.value)
  }

  function renderPorFuncao(){
    if(inpIdade >= 65){
      return <RenderFuncaoTrue/>
    }else{
      return <RenderFuncaoFalse/>
    }
    
    
  }
  return (
    <>
      <button onClick={mudarEstado}>Mudar Estado</button>
      <button onClick={() => setEstado (!estado)}>Mudar Estado AF</button>

      {estado && <RenderBooleano />}


      <input type="number" 
        value = {inpIdade}
        onChange = {atualizarIdade}
        placeholder='Digite um Número'
      />

      {inpIdade >=18 && <RenderCondicional/>}

      { inpIdade<=12 ? <RenderTernario/> : <RenderTernarioFalso/>}

      {renderPorFuncao()}

    </>
  )
}

export default App
