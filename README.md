# Programação Assistida por IA com Amazon CodeWhisperer

Hoje, as ferramentas de desenvolvimento de software alimentadas por inteligência artificial estão permitindo que as pessoas construam soluções de software usando a mesma linguagem utilizada ao falar com outras pessoas.<br>
Essas ferramentas alimentadas por IA traduzem a linguagem natural para as linguagens de programação que os computadores entendem.<br><br>
Essa mudança de paradigma é impulsionada pelo <a href="https://openai.com/blog/openai-codex">Codex>/a>, um modelo de machine learning da empresa de pesquisa e desenvolvimento de IA, a <a href="https://openai.com/">OpenAI</a>, 
que pode traduzir comandos de linguagem natural em código em mais de uma dúzia de linguagens de programação. <br><br>

A IA auxilia na programação em várias formas:

1. **Assistência de escrita de código**: Sugerindo trechos de código, completando linhas ou gerando código-fonte com base nas especificações do programador.
2. **Detecção de erros e depuração**: Analisando o código para identificar bugs, erros e vulnerabilidades, fornecendo sugestões de correção.
3. **Tradução de linguagens de programação**: Convertendo código entre diferentes linguagens para facilitar o desenvolvimento em ambientes familiares.
4. **Otimização de desempenho**: Sugerindo melhorias no código para torná-lo mais eficiente e econômico em recursos.
5. **Geração automática de testes**: Criando casos de teste automatizados para garantir o correto funcionamento do software.
6. **Análise de código legado**: Compreendendo sistemas antigos para auxiliar em sua manutenção e atualização.
7. **Extração de informações e insights**: Analisando grandes volumes de código para obter informações úteis, identificar padrões e melhorar a qualidade geral do código.

Exemplos de ferramentas de Programação Assistida por IA:

- <a href="https://aws.amazon.com/codewhisperer/">**Amazon CodeWhisperer**</a>
- <a href="https://github.com/features/copilot">**GitHub Copilot**</a>
- <a href="https://www.useblackbox.io/">**Blackbox**</a>
- <a href="https://www.tabnine.com/">**Tabnine**</a>
- <a href="https://www.easycode.ai/">**EasyCode**</a>
- <a href="https://codegeex.cn/">**CodeGeex**</a>

Em resumo, a programação assistida por IA é a aplicação de inteligência artificial para auxiliar os desenvolvedores de software em várias tarefas, como sugerir código, detectar erros, traduzir linguagens, otimizar o desempenho, gerar testes automatizados, analisar código legado e extrair informações úteis. Ela visa tornar o desenvolvimento mais produtivo e eficiente.

-----

### Referências

[1] "Vídeo sobre Programação Assistida por IA." YouTube. Disponível em: https://www.youtube.com/watch?v=0PpmtFfh3HI&t=3175s.

[2] "Como a IA facilita a vida dos desenvolvedores e ajuda todos a aprender sobre desenvolvimento de software." Microsoft News. Disponível em: https://news.microsoft.com/pt-br/como-a-ia-facilita-a-vida-dos-desenvolvedores-e-ajuda-todos-a-aprender-sobre-desenvolvimento-de-software/.

# Amazon CodeWhisperer

- O Amazon CodeWhisperer é um gerador de código de uso geral baseado em machine learning que fornece recomendações de código em tempo real.
- À medida que você escreve código, gera CodeWhisperer automaticamente sugestões com base no código e nos comentários existentes. 
- As recomendações personalizadas podem variar em tamanho e escopo, abrangendo desde um comentário de uma única linha até funções totalmente formadas.
- O CodeWhisperer também pode escanear seu código para destacar e definir problemas de segurança.
- O CodeWhisperer suporta geração de código para 15 linguagens de programação. A precisão e qualidade da geração de código para uma linguagem de programação depende do tamanho e qualidade dos dados de treinamento.
- Linguagens Suportadas:
1. Em termos da qualidade dos dados de treinamento, as linguagens de programação com maior suporte são: Java, Python, JavaScript, TypeScript e C#.
2. O CodeWhisperer também suporta geração de código para as seguintes linguagens: Ruby, Go, PHP, C++, C, Shell, Scala, Rust, Kotlin e SQL.

### AWS Toolkit for IntelliJ IDEA

- A JetBrains é uma empresa de software que desenvolve várias IDEs (Ambientes Integrados de Desenvolvimento).
- O CodeWhisperer suporta todas as IDEs da JetBrains, com exceção da JetBrains Gateway.
- O CodeWhisperer é executado nas IDEs da JetBrains por meio do AWS Toolkit, que é uma extensão da JetBrains.<br><br>

#### Instalando o AWS Toolkit para IntelliJ IDEA (for Java development)

1. No menu principal da JetBrains: File > Preferences > Plugins > Marketplace > AWS Toolkit
<img src="../imgs/codewhisperer1.png"/> 
2. Restart a IDE
<img src="../imgs/codewhisperer2.png"/>
3. Conectando o CodeWhisperer com AWS Builder ID
- No canto superior esquerdo irá aparecer a logo da ferramenta da AWS. Clique nela. Abrirá uma janela abaixo no canto inferior esquerdo: Developer Tools > CodeWhisperer > Start
<img src="../imgs/codewhisperer3.png"/>
- Agora faça o Login com AWS Builder ID. Clique no botão Open and Copy Code
<img src="../imgs/codewhisperer4.png"/>
4. Você será redirecionado para fazer o login no AWS Builder. 
- Autorize a requisição para conectar sua IDE com a AWS
  <img src="../imgs/codewhisperer5.0.png"/>
- Você poderá criar um AWS Builder ID ou fazer o login caso já tenha (o meu caso)
<img src="../imgs/codewhisperer5.1.png"/>
- Insira seu endereço de email cadastrado > Next
<img src="../imgs/codewhisperer5.2.png"/>
- Insira um nickname > Next
<img src="../imgs/codewhisperer5.3.png"/>
- Insira o código de verifição que você recebeu no e-mail > Verify
<img src="../imgs/codewhisperer5.4.png"/>
- Com seu e-mail verificado: Insira a Password > Confirm password > Create AWS Builder ID
<img src="../imgs/codewhisperer5.5.png"/>
- Permita a AWS acessar seus dados: Allow
<img src="../imgs/codewhisperer5.6.png"/>
- Pronto! Agora você poderá utilizar o AWS Toolkit no IntelliJ
<img src="../imgs/codewhisperer5.7.png"/>
5. De volta no IntelliJ
- Permaneça conectado no CodeWhisperer com AWS Builder ID. Clique em **Yes**
<img src="../imgs/codewhisperer6.png"/>
- Observe que o CodeWhisperer já está funcionando
<img src="../imgs/codewhisperer7.png"/>
- Entre nas configurações do CodeWhisperer e selecione todas as opções. No meu caso, apenas a primeira não estava selecionada.
<img src="../imgs/codewhisperer8.png"/>

-----

### Referências

[1] "CodeWhisperer - AWS Toolkit for Visual Studio Code." AWS Documentation. Disponível em: https://docs.aws.amazon.com/pt_br/toolkit-for-vscode/latest/userguide/codewhisperer.html.

[2] "CodeWhisperer - Language IDE Support." AWS Documentation. Disponível em: https://docs.aws.amazon.com/codewhisperer/latest/userguide/language-ide-support.html#language-support.

[3] "AWS Toolkit for JetBrains." AWS Documentation. Disponível em: https://docs.aws.amazon.com/toolkit-for-jetbrains/latest/userguide/welcome.html.

[4] "AWS Toolkit for IntelliJ." Amazon Web Services. Disponível em: https://aws.amazon.com/intellij/.



