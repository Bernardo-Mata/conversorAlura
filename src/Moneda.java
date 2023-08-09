/**
 * @author Bernardo Mata
 * @version 0.1;
 * @description la Clase Moneda recopila los parametros necesarios para crear un
 * conversor de monedas; mientras que los metodos son las conversiones de las monedas: dolar, euro, pesoMX, bolivar y peso ARG.
 */
public class Moneda  {
    private double ValorMonedaConvertir;
    private String Pais;
    private double MonedaConvertida;

    /**
     *
     * @param _ValorMoneda
     * @param _Pais
     */
    public Moneda(double _ValorMoneda, String _Pais ){
        this.ValorMonedaConvertir = _ValorMoneda;
        this.Pais = _Pais;
    }

        //Dolar
    /**
     * @description Realiza la conversion de la Moneda a dolar
     * @return El valor de la conversion
     */
    public double ConvertirMonedaADolar(){
        this.MonedaConvertida = this.ValorMonedaConvertir/17;
        return this.MonedaConvertida;
    }
    /**
     * @description Realiza la conversion del dolar a la moneda
     * @return El valor de la conversion
     */
    public double ConvertirDolarAMoneda(){
        this.MonedaConvertida = this.ValorMonedaConvertir*17;
        return this.MonedaConvertida;
    }



    //Euro

    /**
     * @description Realiza la conversion de la Moneda a Euro
     * @return El valor de la conversion
     */
    public double ConvertirMonedaAEuro(){
        this.MonedaConvertida = this.ValorMonedaConvertir/18.9;
        return this.MonedaConvertida;
    }

    /**
     * @description Realiza la conversion del dolar a la moneda
     * @return El valor de la conversion
     */

    public double ConvertirEuroAMoneda(){
        this.MonedaConvertida = this.ValorMonedaConvertir*18.9;
        return this.MonedaConvertida;
    }


}
