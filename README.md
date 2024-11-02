Repositório com respostas do LeetCode. (Relatório Diário)

Por enquanto o método de estudo utilizado é: Eu penso na resolução do problema, após isto eu desenvolvo o código.

Quando não consigo chegar a um algoritmo satisfatório ou em uma resolução de fato, vou atrás de dicas ou do próprio código pronto e estudo sobre ele.

TODOS os exercícios serão revistos e estudados diariamente.

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
consegui fazer tranquilamente (Tirando os problemas da descrição desse exercicio que me fizeram submeter errado algumas vezes), aparentemente a prática esta dando resultado.
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

### Perdi o medo da doc ###
**31/10/24: Preciso confessar... Hoje talvez tenha sido um dos melhores dias em relação a estudo, pois ao invés de ir atrás de tutoriais em video ou algum curso, recorri 100% a documentação, descobri (pelo menos o básico) de como se declara exchanges, filas, como enviar uma classe simples por mensagem (Oque abre um leque ENORME de possibilidades), eu me senti de fato como se estivesse dissecando os métodos da doc e descobrindo o que cada uma faz. Pretendo estudar mais assim daqui pra frente e menos com tutoriais.
Antes tarde do que nunca. (Será que o ato de ter começado a fazer leetcode, melhorou de alguma forma a minha "Vontade" (Essa não é a melhor palavra) de experimentar coisas mais complexas?)**

**01/11/24: Fiz o mesmo de ontem porém com spring boot, foi um sucesso. Ja tenho uma ideia de projeto para fazer, agora só irei implementar.(leetcode ficou de lado por enquanto)**

**02/11/24: Prátiquei um pouco de shellscript e senti um certo controle a mais em relação ao terminal e ao PC em geral, já havia praticado antes mas resolvi fixar mais um pouco por que acho uma linguagem muito importante para se aprender. (devo fazer mais alguma coisa hoje)**


