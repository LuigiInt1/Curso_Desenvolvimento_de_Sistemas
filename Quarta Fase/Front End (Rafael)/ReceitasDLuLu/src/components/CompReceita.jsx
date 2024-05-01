import './CompReceita.css'

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

export default CompReceita;