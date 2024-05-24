// Importa o módulo React do pacote react
import React from 'react';
// Importa o hook useNavigate do pacote react-router-dom
import { useNavigate } from 'react-router-dom';
// Define a função do componente Home
function Home() {
  // Obtém a função de navegação usando o hook useNavigate
  const irPara= useNavigate();
  // Define a função handleClick que será chamada ao clicar no botão
  const handleClick = (path) => {
    // Navegar para a página Sobre ao clicar em algum botão
    irPara(path);
  };
  // Retorna a estrutura JSX da página inicial
  return (
    <div>
      {/* Título da página inicial */}
      <h1>Página Inicial</h1>      
      {/* Botão para navegar para a página About ao ser clicado */}
      <button onClick={() => {handleClick('/sobre')}}>Ir para Sobre</button>
    </div>
  );
}
// Exporta o componente Home como padrão
export default home;
