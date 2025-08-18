package ronaldo.classExercises.ex02;

public class Carro {
    private boolean estado;
    private int velocidade;
    private int marcha;

    public Carro () {
        estado = false;
        velocidade = 0;
        marcha = 0;
    }

    public void ligarCarro (){
        if (!estado) {
            estado = true;
            System.out.println("O carro foi ligado");
        } else {
            System.out.println("O carro já estava ligado");
        }
    }

    public void desligarCarro (){
        if (estado) {
            if (marcha == 0 && velocidade == 0) {
                estado = false;
                System.out.println("O carro foi desligado");
            } else {
                System.out.println("Pare o carro e ponha em ponto morto para desligar");
            }
        } else {
            System.out.println("O carro já estava desligado");
        }
    }

    public void acelerar() {
        if (estado) {
            switch (marcha) {
                case 0: {
                    System.out.println("Coloque o carro em marcha para acelerar");
                    break;
                }
                case 1: {
                    if (velocidade < 20) {
                        velocidade += 1;
                        System.out.println("Acelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível acelerar mais que 20Km na 1° marcha");
                    }
                    break;
                }
                case 2: {
                    if (velocidade < 40) {
                        velocidade += 1;
                        System.out.println("Acelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível acelerar mais que 40Km na 2° marcha");
                    }
                    break;
                }
                case 3: {
                    if (velocidade < 60) {
                        velocidade += 1;
                        System.out.println("Acelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível acelerar mais que 60Km na 3° marcha");
                    }
                    break;
                }
                case 4: {
                    if (velocidade < 80) {
                        velocidade += 1;
                        System.out.println("Acelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível acelerar mais que 80Km na 4° marcha");
                    }
                    break;
                }
                case 5: {
                    if (velocidade < 100) {
                        velocidade += 1;
                        System.out.println("Acelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível acelerar mais que 100Km na 5° marcha");
                    }
                    break;
                }
                case 6: {
                    if (velocidade < 120) {
                        velocidade += 1;
                        System.out.println("Acelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível acelerar mais que 120Km na 6° marcha");
                    }
                    break;
                }

            }
        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void desacelerar() {
        if (estado) {
            switch (marcha) {
                case 0: {
                    System.out.println("Coloque o carro em marcha para desacelerar");
                    break;
                }
                case 1: {
                    if (velocidade > 0) {
                        velocidade -= 1;
                        System.out.println("Desacelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível desacelerar mais");
                    }
                    break;
                }
                case 2: {
                    if (velocidade > 21) {
                        velocidade -= 1;
                        System.out.println("Desacelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível desacelerar mais que 21Km na 2° marcha");
                    }
                    break;
                }
                case 3: {
                    if (velocidade > 41) {
                        velocidade -= 1;
                        System.out.println("Desacelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível desacelerar mais que 41Km na 3° marcha");
                    }
                    break;
                }
                case 4: {
                    if (velocidade > 61) {
                        velocidade -= 1;
                        System.out.println("Desacelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível desacelerar mais que 61Km na 4° marcha");
                    }
                    break;
                }
                case 5: {
                    if (velocidade > 81) {
                        velocidade -= 1;
                        System.out.println("Desacelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível desacelerar mais que 81Km na 5° marcha");
                    }
                    break;
                }
                case 6: {
                    if (velocidade > 101) {
                        velocidade -= 1;
                        System.out.println("Desacelerando... Velocidade atual: " + velocidade + "Km");
                    } else {
                        System.out.println("Não é possível desacelerar mais que 101Km na 6° marcha");
                    }
                    break;
                }
            }
        } else {
            System.out.println("O carro está desligado");
        }
    }

    public void virarEsquerda (){
        if (velocidade > 0 && velocidade <= 40) {
            System.out.println("O carro virou à esquerda");
        } else {
            System.out.println("O carro deve estar entre 1km~40km para virar");
        }
    }

    public void virarDireita (){
        if (velocidade > 0 && velocidade <= 40) {
            System.out.println("O carro virou à direita");
        } else {
            System.out.println("O carro deve estar entre 1km~40km para virar");
        }
    }

    public void verificarVelocidade () {
        System.out.println("Velocidade atual: "+velocidade+"Km");
    }

    public void aumentarMarcha () {
        if (marcha < 6) {
            marcha ++;
            System.out.println("Marcha atual: "+marcha+"°");
        } else {
            System.out.println("Marcha limite atingida");
        }
    }

    public void diminuirMarcha () {
        if (marcha > 0) {
            marcha--;
            System.out.println("Marcha atual: "+marcha+"°");
        } else {
            System.out.println("O carro já está em ponto morto");
        }
    }
}
