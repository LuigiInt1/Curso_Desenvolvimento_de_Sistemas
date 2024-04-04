import './App.css'
import Pessoa from './compoenents/Pessoa'
import Pessoa2 from './compoenents/Pessoa2'

function App() {
  
  var pessoas = [
    {id:1 , nome: "João", profissao: "Engenheiro"},
    {id:2 , nome: "Maria", profissao: "Médica" },
    {id:3 , nome: "Pedro", profissao: "Professor" },
    {id:4 , nome: "Ana", profissao: "Advogada" },
    {id:5 , nome: "Carlos", profissao: "Arquiteto" },
    {id:6 , nome: "Sofia", profissao: "Programadora" },
    {id:7 , nome: "Luís", profissao: "Designer" },
    {id:8 , nome: "Mariana", profissao: "Contadora" },
    {id:9 , nome: "Ricardo", profissao: "Jornalista" },
    {id:10 , nome: "Fernanda", profissao: "Enfermeira" },
    {id:11 , nome: "Gabriel", profissao: "Analista de Sistemas" },
    {id:12, nome: "Juliana", profissao: "Psicóloga" },
    {id:13, nome: "Lucas", profissao: "Empresário" },
    {id:14, nome: "Lara", profissao: "Bióloga" },
    {id:15, nome: "Paulo", profissao: "Fotógrafo" }
];

  return (
    <div className='flexLinha'>
      
     {
      pessoas.map( (pessoa) => (
        <Pessoa key={pessoa.id} nome={pessoa.nome} profissao={pessoa.profissao} />
      ) ) 
     }


    </div>
  )
}


export default App
