import './Pessoa.css'

function Pessoa(props){

    return(
        <div className='divPessoa'>
            <h2>Nome: {props.nome}</h2>
            <p>Profissão: {props.profissao}</p>
            <img id='padeiro' src="./images/padeiro.png" alt="Erro" />
        </div>
        
    )
}

export default Pessoa;