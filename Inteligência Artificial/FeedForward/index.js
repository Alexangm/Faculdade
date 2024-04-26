function funcSum(arr = []){
    return arr.reduce((a,b) => a+b);
}

function gradientDescent (n = 0) {
    return n*(1-n);
}

function feedForward (imputs = [], target = 0, epochs = 1){
    if(target <= 0) target = 0.1;
    else if(target > 1) target = 1;

    let weights = []; 
    for(let i=0;i<imputs.length;i++){
        weights.push(Math.random());
    }
    for(let i=1; i<=epochs; i++){
        let multiply = [];
        for(let j=0;j<imputs.length;j++){
            if(imputs[j]<=0) imputs[j]=0,1;
            multiply.push(imputs[j]*weights[j]);
        }
        let sum = funcSum(multiply);
        let output = parseFloat(Math.tanh(sum)).toFixed(4);
        let error = parseFloat(Math.abs(target-output)).toFixed(4);

        for(let j=0; j<imputs.length;j++){
            weights[j]+=imputs[j]*gradientDescent(error);
        }
        let epoch = i.toString().padStart(7, ' ');
        console.log('Época: ' + epoch + ' - Taxa de erro: ' + error + ' Saída: ' + output);

    }
}

feedForward([0.04], 0.1, 4400);