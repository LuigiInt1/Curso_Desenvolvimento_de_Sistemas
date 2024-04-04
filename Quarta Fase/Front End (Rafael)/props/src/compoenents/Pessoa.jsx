import './Pessoa.css'

function Pessoa(props){

    return(
        <div className='divPessoa'>
            <h2>Nome: {props.nome}</h2>
            <p>Profissão: {props.profissao}</p>
        </div>
        
    )
}

export default Pessoa;