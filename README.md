<h2>Padrões de Projetos</h2>

<table>
  <thead>
    <tr>
      <th>Padrão</th>
      <th>Antipadrão</th>
      <th>Descrição</th>
      <th>Problema que Resolve</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Strategy</td>
      <td>Herança</td>
      <td>O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.</td>
      <td>Esse padrão resolve o problema de ter múltiplos algoritmos com comportamentos diferentes, permitindo que o cliente escolha e utilize um algoritmo específico em tempo de execução, evitando a necessidade de múltiplos condicionais e simplificando a lógica de seleção do algoritmo.</td>
    </tr>
    <tr>
      <td>Observer</td>
      <td>Acoplamento excessivo</td>
      <td>O padrão Observer estabelece uma dependência um-para-muitos entre objetos, onde um objeto chamado "sujeito" mantém uma lista de seus dependentes chamados "observadores". Quando o sujeito muda de estado, todos os observadores são notificados e atualizados automaticamente.</td>
      <td>Esse padrão resolve o problema de acoplamento excessivo entre o sujeito e os observadores, permitindo que diferentes objetos interessados em mudanças de estado sejam notificados de forma independente e sem que o sujeito precise conhecer os detalhes de implementação de cada observador.</td>
    </tr>
    <tr>
      <td>Singleton</td>
      <td>Diversas instâncias da mesma classe</td>
      <td>O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso para essa instância.</td>
      <td>Esse padrão resolve o problema de garantir que uma classe tenha uma única instância em todo o sistema. É útil quando é necessário compartilhar e acessar essa única instância de forma global, evitando a criação de múltiplas instâncias e inconsistências de estado.</td>
    </tr>
    <tr>
      <td>Composite</td>
      <td>Tratamento diversificado de classes</td>
      <td>O padrão Composite permite que objetos sejam agrupados em estruturas de árvore para representar hierarquias parte-todo. Os clientes podem tratar objetos individuais e composições de forma uniforme.</td>
      <td>Esse padrão resolve o problema de tratar objetos individuais e coleções de objetos de maneira uniforme, permitindo que os clientes não se preocupem com a diferença entre objetos individuais e composições. Isso simplifica a manipulação de estruturas hierárquicas e permite uma abordagem consistente para acessar e manipular os elementos.</td>
    </tr>
    <tr>
      <td>Facade</td>
      <td> Classe Fachada sobrecarregada de funcionalidades/responsabilidades</td>
      <td>O padrão Facade fornece uma interface simplificada para um conjunto complexo de subsistemas. Ele encapsula a funcionalidade dos subsistemas e fornece uma interface mais fácil de usar para os clientes.</td>
      <td>Problema Resolvido: Esse padrão resolve o problema de complexidade desnecessária ao lidar com subsistemas complexos. Através da fachada, os clientes podem interagir com os subsistemas de forma mais simples e direta, sem precisar conhecer os detalhes e a estrutura interna dos subsistemas. Isso reduz a dependência e simplifica o uso dos subsistemas.</td>
    </tr>
  </tbody>
</table>