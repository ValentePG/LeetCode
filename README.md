# Relatório Diário #

**9/10/2024: Tudo sempre se resolve melhor com HashMaps, então vou começar a ir direto para uma solução com HashMaps visando melhorar a complexidade do algoritmo.**
*Meu problema atual é mais na parte do código do que na parte do problema em si, coisa que ja sei que melhora com o tempo pois a algum tempo atrás nem na resolução eu conseguia pensar.*

**10/10/2024: Tentei um desafio médio sobre linked list, ja sabia como funcionava uma então foi mais simples de pensar na resolução, porém ainda assim tive problemas com conceitos de matemática. 
Por enquanto alguns padrões estão sendo percebidos: 1º HashMaps, 2º Conceitos matemáticos para reverter números (x % 10 && x / 10)**

**11/10/24: Fiz mais um exercicio sobre linked list, por falta de atenção acabei não vendo que o exercicio pedia para remover a partir do FINAL da lista. Resultado: acabei criando o algoritmo de remoção de acordo com o número dado pelo usuário,
tenho esse algoritmo em outro repo sobre DSA então aqui mantive apenas o da solução, preciso estudar ambos os algoritmos escritos até aqui. Talvez eu use o final de semana para revisar ou até fazer mais.**
**Ainda no dia 11: Decidi por curiosidade inverter uma árvore binária sozinho e milagrosamente eu consegui completar o primeiro leetcode 100% solo. É bobeira, porém eu fiquei relativamente feliz.**

**12/10/24: Dia Ocioso de LeetCode, Apenas vi novamente a série de video do Akita falando sobre DSA**
**13/10/24: Mais um dia organizando os estudos e fazendo estudo de mercado.**

**14/10/24: Tentei entregar mais um exercício, mas ao submeter minha solução só passou em 28 casos, aparentemente o problema ocorre quando tem mais de 2 repetições do mesmo valor, sinto que consigo resolver porém não hoje.
Amanhã farei 2 para compensar.**

**15/10/24: Mais padrões percebidos em exercicios envolvendo linkedLists.**

**16/10/24: Mais uma vez eu consigo resolver o problema, porém na hora de traduzir em código eu falho :/**

**17/10/24: Parei para refletir sobre os exercicios de linkedLists e quase todos seguem o mesmo padrão de two pointers.
(Mais tarde) Voltei para fazer mais um exercicio, e acabei me deparando com uma solução que ja havia utilizado no exercicio two sum, 
consegui fazer tranquilamente (Tirando os problemas da descrição desse exercicio que me fizeram submeter errado algumas vezes), aparentemente a prática esta dando resultado.**
*(A partir de hoje irei alocar 2 horas por dia para praticar, afinal eu ainda preciso desenvolver projetos para portfólio)***

**18/10/24: Refatorei alguns códigos anteriores e fiz mais um exercicio. Mais uma vez, traduzir a solução em código foi um problema enorme,
mas absorvi mais um padrão de solução bem interessante, amanhã revisarei todos os algoritmos que fiz até aqui para refrescar a memória.**

**19/10/24: Descanso**

**20/10/24: Decidi criar um projeto de automação simples em shell script para utilizar enquanto versiono este repo. Vai ser bem simples na verdade apenas irei implementar um .sh com comandos como git add, git commit -m "" e git push, onde irei personalizar apenas a mensagem do commit, o resto vai ser padrão.**

**21/10/24: Criei o programa em shell simples para executar toda vez que eu quiser dar um push ou pull no repo (Não fiz leetcode hoje).**
  
**22/10/24: Conheci um site chamado neetcode.io onde contém um roadmap que achei viável para utilizar enquanto treino DSA em leetcode. Também adicionei mais 2 exercicios de arrays.**

**23/10/24: Conheci um novo padrão two pointer, que basicamente é ter um ponteiro no inicio e um no final de determinada lista, o ponteiro do inicio você incrementa fazendo determinado processo e do ponteiro final você decrementa. Não imaginava que esse era o famoso two pointer, achei que fosse o mesmo padrão do faster e lower de linked lists mas aparentemente são 2 coisas diferentes.**

**24/10/24: Cada dia que passa sinto que sei menos, mas isso é bom. A solução do desafio de hoje foi absurda e eu não passei nem perto da resolução.
com certeza vou revisar essa aqui milhões de vezes.**

**25/10/24: Eu acabei testando uma nova forma para fazer leetcode de ontem pra hoje, onde eu tento resolver um novo desafio, caso não consiga depois de algum tempo busco a solução,entendo o algoritmo utilizado e commito ele no *Repo*. No outro dia me forço a implementar este algoritmo diretamente no leetcode, sem consultar em lugar algum (A não ser que eu não consiga novamente).
E aparentemente eu consegui tanto pensar na explicação do algoritmo, quanto o exercício foi resolvido em menos de 10 minutos aproximadamente. Eu vou tentar sempre fazer isso a partir de hoje. (Bucket Sort é maluquice!)**

**26/10/24: Descanso.** 

**27/10/24: Acabei tendo uma ideia de projeto onde usarei RabbitMQ ou Kafka para conectar uma aplicação SpringBoot com outra em python, a cada registro novo no BD da aplicação principal é enviado uma mensagem para o "cluster", o programa python le desse cluster e busca a informação que mudou dentro do BD principal e grava em um arquivo txt (Poderia ser em qualquer outro lugar ou extensão) simples porém eu estava mesmo precisando fazer algo parecido com microserviços e utilizando mensageria.**

**28/10/24: Estudei sobre RabbitMQ e aprendi algumas coisas básicas que vão ser o suficiente para por o projeto em prática, como o funcionamento de exchanges, alguns tipos diferentes delas. A funcionalidade e o propósito de mensageria eu ja conhecia, porém agora sinto que solidifiquei mais o conhecimento, provavelmente amanhã eu começo o projeto.**

**29/10/24: Falhei**

**30/10/24: Iniciei a prática de "Micro serviços" e mensageria com o objetivo de fazer o projeto citado no dia 27/10, adicionei 2 repos com um projeto de base que criei apenas utilizando o get started do RabbitMQ (bem simples), a ideia agora é ir dando forma ao projeto aos poucos diariamente. Não consegui fazer LeetCode nos ultimos 3 dias, mas foi por um bom motivo.**

# Perdi o medo da doc #
**31/10/24: Preciso confessar... Hoje talvez tenha sido um dos melhores dias em relação a estudo, pois ao invés de ir atrás de tutoriais em video ou algum curso, recorri 100% a documentação, descobri (pelo menos o básico) de como se declara exchanges, filas, como enviar uma classe simples por mensagem (Oque abre um leque ENORME de possibilidades), eu me senti de fato como se estivesse dissecando os métodos da doc e descobrindo o que cada uma faz. Pretendo estudar mais assim daqui pra frente e menos com tutoriais.
Antes tarde do que nunca. (Será que o ato de ter começado a fazer leetcode, melhorou de alguma forma a minha "Vontade" (Essa não é a melhor palavra) de experimentar coisas mais complexas?)**

**01/11/24: Fiz o mesmo de ontem porém com spring boot, foi um sucesso. Ja tenho uma ideia de projeto para fazer, agora só irei implementar.(leetcode ficou de lado por enquanto)**

**02/11/24: Prátiquei um pouco de shellscript e senti um certo controle a mais em relação ao terminal e ao PC em geral, já havia praticado antes mas resolvi fixar mais um pouco por que acho uma linguagem muito importante para se aprender. (devo fazer mais alguma coisa hoje)**

**03/11/24: O plano da semana é implementar o rabbitMQ em um projeto um pouco mais "Robusto". Planejo também rever assuntos mais voltados a código como por exemplo arquitetura hexagonal e arquitetura limpa, não posso passar desse ano sem melhorar um pouco mais meu código em si.**

**04/11/24: Iniciei mais um conteúdo com o professor Isidro sobre Web Development com java, é uma sequência de aulas antigas de 5 anos atrás, porém que acredito que vá adicionar muito ao fundamento que identifiquei que estava faltando em java.**

**05/11/24: Aprofundei sobre servlet com o isidro.**

**06/11/24: Aprendi como configurar um webapp com servlet + jsp no intellij, subir um tomcat e expor rotas. Aparentemente é oque o springboot abstrai pra gente na hora de criar apis. (Obviamente em uma escala muito maior que isso)
Vou continuar a série de aulas com o isidro para me aprofundar mais.**

**07/11/24: falhei.**

**08/11/24: Preciso me organizar melhor, essa semana foi uma bagunça, hoje assisti uns videos do akita que me fizeram refletir bastante como sempre, mas acabei não colocando muito a mão no código.**

**09/11/24: Estudei um pouco sobre redes no canal hardwaredesbrasil que é uma branch do curso em video e me deu um fundamento legal sobre algumas coisas importantes.
Me dei conta que hoje faz exatamente um mês que eu comecei a fazer este relatório e é muito interessante reparar o quanto as coisas mudaram. Os dias anotados com descanso, significam que em algum dos dias do final de semana eu acabei não fazendo muito código e não tinha oque commitar (apesar de ainda assim ter consumido algum tipo de conteúdo de Tech)
Já os anotados com falhei significa basicamente a mesma coisa só que em um dia da semana, que é realmente considerado uma falha pois é quando eu deveria estar me esforçando mais então a boa noticia: em um mês foram apenas 2 falhas e 2 descansos. A má notícia: Apesar de poucos "erros" eu ainda preciso melhorar, foi um mês instável, isso aqui era pra ser uma repo de leetcode e virou um diário. Então para o próximo mês eu deveria focar mais ao invés de tentar abraçar muita coisa ao mesmo tempo.
Ao mesmo tempo que tenho que melhorar, fico feliz pois estou fazendo algo diferente, algo que nunca havia tentado antes que é documentar o meu dia a dia, ainda que apenas o necessário.**

**10/11/24: Fiz a compra do livro de sistemas operacionais do tanenmbaun chega amanhã, pretendo evoluir minha capacidade de leitura e entendimento de livros mais técnicamente complexos e consequentemente melhorar os meus fundamentos como profissional de TI.
Preciso voltar a fazer o curso de spring security é o ultimo módulo que falta para conseguir projetar completamente um sistema em spring, essa semana vai ser pesada...
*Inglês, CI/CD (Facul), Spring Security , leetcode + prática e Sistemas Operacionais***

**11/11/24: Decidi terminar de assistir a playlist do isidro sobre web para poder minimamente entender como um projeto 0 frameworks funciona em java, hoje (dia 12) eu termino.**

**12/11/24: Terminei a playlist do isidro e deu para entender bastante como as coisas funcionam por debaixo dos panos com servlets e também um pouco de jsp, apesar de achar uma bagunça, não sei se irei fazer um projeto relevante com essas tecnologias, mas vai me servir muito bem a partir de agora nas aplicações em springboot que eu fizer, além disso a aula de upload de arquivos foi sensacional, ler um arquivo multipart que vem direto de um formulário foi algo novo pra mim e me deu bastante vontade de me aprofundar nesta parte, hoje (dia 13) ja fiz alguns códigos utilizando FileInputStream, InputStream, preciso aprender mais sobre o OutPutStream, da pra fazer muita coisa legal com isso e é algo q eu sempre me esquivei por ignorância talvez, enfim, antes tarde do que nunca, é mais uma ferramenta importante que estou aprendendo a utilizar.**

**13/11/24: Estou maratonando uma série de videos do canal do Isidro novamente e to aprendendo muita coisa sobre serialização e desserialização, encaixou perfeitamente com o aprendizado de ontem sobre InputStream, eu fiz uns testes com JSON e consegui transformar em classe java e vice-versa com GSON e Jackson e de repente eu me vi em uma das aulas do Isidro falando sobre reflection que é oque essas bibliotecas justamente usam por dentro delas e foi um mindblowing total.**

**14/11/24: Maratonei o canal do isidro e estou dando uma repassada no DevDojo para relembrar alguns utilitários de java e outras coisas mais.**

**15/11/24: Estou aprofundando um pouco mais no pacote IO e NIO do java, e é talvez uma das coisas mais legais que eu ja vi, a sensação de você ler dados, escrever dados, depois você transferir estes dados para outro lugar, fisicamente (em disco), é quase a mesma sensação de quando eu estudei front-end pela primeira vez, da pra sentir que você ta criando algo de verdade, você de fato ve a coisa acontecendo, é um pouco diferente de quando estamos criando uma API, apesar de não ser TÃO DIFERENTE assim, eu não sei explicar.**

**16/11/24: Estudei um pouco sobre comunicação entre sistemas via socket em java, dei uma revisitada no conceito de threads e pensando seriamente em fazer um chatbot com IA utilizando esses 2 conceitos utilizando LangChain4j.**

**17/11/24: Quase todo domingo eu tiro um momento do dia para pensar no que eu vou fazer com a minha carreira e eu não consigo parar de pensar em fazer meu próprio software e tentar vender, eu estudo quase todo santo dia pra isso, ser bom o suficiente para que eu viva criando software e resolvendo o problema das pessoas através deles, mesmo que sozinho, mas confesso que é assustador as vezes.**

**18/11/24: Tirei o dia para matar as aulas da faculdade de uma vez, felizmente esse trimestre teve spring, docker e ci/cd, que tirando ci/cd eu ja to até trabalhando tranquilo com o resto e teve react também mas sinceramente... o commit do dia 19 vai ser autoexplicativo.**

**19/11/24: Comecei a estudar Angular para integrar com minhas APIS e vou repassar o assunto de ci/cd visto na faculdade pois achei importante demais, além disso provavelmente irei assinar um plano de vps para poder brincar de fazer deploy das aplicações, para poder chegar mais perto de uma aplicação em produção real.**

**20-21-22/11/24: Configurar websockets ta levando mais tempo do que eu esperava, amanhã irei tentar novamente.** 

**23-24/11/24: Consegui configurar o front-end e o back-end para se conectarem via websockets, esta semana irei fazer o esqueleto do projeto, o objetivo é fazer um chat igual um GPT da vida, vai ter um prompt do client e o servidor imediatamente responde com oque foi respondido pela IA, bem simples apenas para aprender mesmo.**

**25/11/24: Acabei dando por conta que inevitávelmente vou ter que usar concorrência no projeto, adicionei um concurrentHashMap para adicionar as sessões e consequentemente ter acesso mais tarde a 2 sessões possivelmente abertas, dando inicio assim a uma sessão compartilhada entre 2 usuários diferentes.**

**26/11/24: Encontrei algumas dificuldades na regra de negócio do projeto, ainda decidindo se terá algum tipo de persistência, inevitavelmente terá mas, para oque eu quero ainda não necessariamente precisaria ter, amanhã irei implementar mais alguma coisa, talvez eu foque mais na parte de envio da mensagem logo já que é o core da aplicação e depois eu organizo melhor os detalhes de implementação.**

**27/11/24: Faltam alguns detalhes mas ja consegui achar uma lógica para resolver a questão do chat, por um lado ja é possível enviar a mensagem e a mesma ser renderizada em uma sessão diferente para outro usuário, agora o código precisa passar por uma refatoração não tão complicada e algumas alterações na própria regra de negócio.**

**28/11/24: Tirei o dia pra fazer algumas alterações no currículo, ainda irei fazer alterações no github e no linkedin. Ainda assim enviei o curriculo para uma vaga de estágio de javinha, sei que tem muita coisa pra melhorar mas quem sabe.**

**29/11/24: Conheci um pouco de uma biblioteca chamada PDFBox que é utilizada para leitura e escrita de pdfs entre outras coisas, achei interessante, acabei fazendo um projeto protótipo onde eu leio o pdf do meu curriculo, passo para uma string e envio para o GPT pedindo uma opinião sobre o currículo. To pensando em implementar o modelo OLLAMA localmente para usar nos projetos, mas eu n sei se meu hardware vai tankar.**

**30/11/24 to 03/12/24: (percebi q as datas do mês passado estavam anotadas com 10 e não com 11... já foi corrigido.) Sobre o final de semana: de repente eu me peguei assistindo aulas de typescript na origamid e uma aula sobre angular de um canal novo chamado angularizando, percebi que eu precisava dar uma afinada no front-end apenas para poder dar alguma interface para minhas apis, acredito que seja um conhecimento importante de se ter, minha bagagem básica em js e o meu nível atual que tenho em programação em geral me deu certo conforto ao ir para o ts que é muito parecido com javinha. Sobre segunda e hoje terca-feira: Continuei assistindo as aulas e tentando implementar algumas coisas no projeto full-stack, acabei descobrindo exatamente oque eu precisava para continuar o projeto em angular e é possível que o projeto saia do lugar agora. (Criei mais um script em shell para automatizar meus relatórios neste repo, agora eu tenho 2 scripts, o que eu fiz nos primeiros dias desse repo e agora este que se integra a ele, mas só utilizo ele se for pra mexer no readMe).**

**04 - 05/12/24: Encontrei um bug no chat onde o client (Angular) não consegue enviar mais de uma mensagem, apenas receber, aparentemente o programa trava após o envio da mensagem, ainda não encontrei o bug mais tarde tentarei novamente.**

**06/12/24: Ainda ontem encontrei o bug citado, era um problema no angular, não estava fazendo o uso do binding, portanto o sistema acabava não funcionando a partir da segunda iteração, hoje adicionei algumas verificações com try catch e arrumei um pouco a estrutura de pastas do projeto, eu ainda estou patinando na estrutura do angular, mas eu vou melhorando com o tempo. Até agora muito satisfeito com a stack que eu escolhi, Spring e Angular são sensacionais.**
