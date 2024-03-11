@echo off
setlocal

rem Defina o diretório onde estão os arquivos executáveis
set "diretorio=C:C:\Users\luigi_bernardo\Documents\Aplicativos Padrao

rem Lista de arquivos executáveis
set "arquivos_executaveis=SupportAssistInstaller.exe Dell-Command-Update-Application-for-Windows-10_PF5GJ_WIN_4.0.0_A00_02.exe VSCodeUserSetup-x64-1.87.1"

rem Itera sobre cada arquivo executável na lista
for %%i in (%arquivos_executaveis%) do (
    rem Constrói o caminho completo para o arquivo executável
    set "caminho_completo=%diretorio%\%%i"
    
    rem Verifica se o arquivo existe antes de executá-lo
    if exist "%caminho_completo%" (
        echo Executando: %%i
        rem Execute o arquivo
        "%caminho_completo%"
    ) else (
        echo Arquivo não encontrado: %%i
    )
)

endlocal
