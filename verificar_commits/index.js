const form = document.querySelector('form')
form.addEventListener('submit', function (event) {
    event.preventDefault();
    const repositorio = document.querySelector('#repositorio').value;
    const dataInicial = document.querySelector('#dataInicial').value;
    const dataFinal = document.querySelector('#dataFinal').value;
    buscarCommits(repositorio, dataInicial, dataFinal);
});

function buscarCommits(repositorio, dataInicial, dataFinal) {
    const array = repositorio.split('/');
    let url = '';
    if (array.length > 2) {
        url = `https://api.github.com/repos/${array[4] + '/' + array[5]}/commits?since=${dataInicial}&until=${dataFinal}`;
    } else {
        url = `https://api.github.com/repos/${array[0] + '/' + array[1]}/commits?since=${dataInicial}&until=${dataFinal}`;
    }
    console.log(url);
    // fetch(url).then(response => response.json()).then(commits => {
    //     contarCommits(commits);
    // }).catch(error =>{
    //     console.log(error);
    // });
}

function contarCommits(commits) {
    const commitsPorDia = {};
    commits.forEach(element => {
        const dataCommit = element.commit.author.date.substring(0, 10);
        if (commitsPorDia[dataCommit]) {
            commitsPorDia[dataCommit].quantidade++;
        } else {
            commitsPorDia[dataCommit] = {quantidade: 1, data: dataCommit};
        }
    });

    const commitsPorDiaArray = Object.keys(commitsPorDia).map(dataCommits => {
        return {data: dataCommits, quantidade: commitsPorDia[dataCommits].quantidade};
    });
    mostrarTela(commitsPorDiaArray);

    function mostrarTela(commits) {
        const dados = document.querySelector('#dados');
        commits.forEach(element => {
            const h1 = document.createElement('h1');
            h1.innerHTML = element.data + ' - ' + element.quantidade;
            dados.appendChild(h1);
        })
    }
}