# AC2_ArqWeb

## 08/05/2024 
 * Gustavo - Responsável pelo levantamento dos requisitos funcionais
 * Lincoln - Responsável pelo relacionamento e responsável pela criação das entidades
 * Vinicius - Responsável pelos diagramas de classes


## OBJETIVO 
Criar uma API capaz de gerenciar e organizar a agenda dos professores que lecionarão os cursos

## LEVANTAMNETO REQUISITOS FUNCIONAIS
### ATORES
1. Professores 
2. Secretária

### SECRETÁRIA
  #### AÇÕES
  1. Pode cadastrar professor;
  2. Pode cadastrar cursos;
  3. Pode cadastrar quais professores tem especialização para lecionar
  
  ##### OBSERVAÇÕES
  * Quando informar o curso, mostra professores especializados ao curso
  * Se professor estiver associado a algum curso na mesma data, a API deve retornar ao usuário que não pode ser feito o vínculo
  
### PROFESSOR
#### AÇÕES
1. Informa sua identificação, retorna sua agenda;
2. Cadastrar o resumo do treinamento 
