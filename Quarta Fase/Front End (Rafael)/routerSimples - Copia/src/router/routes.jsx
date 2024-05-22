import Home from "../pages/Home";
import Cadastro from "../pages/Cadastro";
import Estoque from "../pages/Estoque";

import { createBrowserRouter } from "react-router-dom";

const router = createBrowserRouter([

    {path: "/", element: <Home/>},
    {path: "/cadastro", element: <Cadastro/>},
    {path: "/estoque", element: <Estoque/>},

])


export default router;