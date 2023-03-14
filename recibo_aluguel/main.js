const formRecibo = document.getElementById('form-recibo');
const btnVoltar = document.getElementById('btn-voltar');
if (btnVoltar){
    btnVoltar.addEventListener('click', voltar =>{
        voltar.preventDefault();
        document.getElementById('visualizar_form_id').style.display = "block";
        document.getElementById('visualizar_recibo_id').style.display = "none";
    })
}
if (formRecibo) {
    formRecibo.addEventListener('submit', evento => {
        evento.preventDefault();

        const formData = new FormData(formRecibo);
        const data = Object.fromEntries(formData);

        if (data) {
            document.getElementById('visualizar_form_id').style.display = "none";

            document.getElementById('mesReferencia_id').innerHTML = data.mesReferencia;
            document.getElementById('valor_id').innerHTML = data.valor;
            document.getElementById('proprietario_id').innerHTML = data.proprietario;
            document.getElementById('cpfCnpjProprietario_id').innerHTML = data.cpfCnpjProprietario;
            document.getElementById('inquilino_id').innerHTML = data.inquilino;
            document.getElementById('cpfCnpjInquilino_id').innerHTML = data.cpfCnpjInquilino;

            document.getElementById('rua_id').innerHTML = data.rua;
            document.getElementById('numero_id').innerHTML = data.numero;
            document.getElementById('pontoReferencia_id').innerHTML = data.pontoReferencia;
            document.getElementById('bairro_id').innerHTML = data.bairro;
            document.getElementById('cidade_id').innerHTML = data.cidade;
            document.getElementById('estado_id').innerHTML = data.estado;
            document.getElementById('cep_id').innerHTML = data.cep;

            document.getElementById('locatario_id').innerHTML = data.inquilino;
            document.getElementById('aluguel_id').innerHTML = data.valor;
            document.getElementById('tipoImovel_id').innerHTML = data.tipoImovel;
            document.getElementById('anoReferencia_id').innerHTML = data.anoReferencia;

            document.getElementById('mes_id').innerHTML = data.mesReferencia;
            document.getElementById('nome_cidade_id').innerHTML = data.cidade;

            document.getElementById('visualizar_recibo_id').style.display = "block";
        }
    });
}