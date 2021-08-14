
package clases;

/**
 *
 * @author Jesus Garcia
 */
public class EspaciosColor {
    
    public float[] convertirYIQaRVA(float[] yiq){
        //Dos maneras de hacerlo 1.0f o hacer conversion a (float) ya que 1.0 es un double literal
        float R = 1.0f * yiq[0] + 0.955f * yiq[1] + 0.618f * yiq[2]; 
        float V = (float) (1 * yiq[0] - 0.271 * yiq[1] - 0.645 * yiq[2]);
        float A = 1f * yiq[0] - 1.11f * yiq[1] + 1.7f * yiq[2];
        
        return new float[]{R,V,A};
    }
    
    public float[] convertirYIQaYCbCr(float[] yiq){
        //Conversion Intermedia
        float R = 1.0f * yiq[0] + 0.955f * yiq[1] + 0.618f * yiq[2]; 
        float V = (float) (1 * yiq[0] - 0.271 * yiq[1] - 0.645 * yiq[2]);
        float A = 1f * yiq[0] - 1.11f * yiq[1] + 1.7f * yiq[2];
        //Conversion que se pide
        float Y = 0.299f * R + 0.587f * V + 0.114f * A;
        float Cb = 0.1687f * R - 0.3313f * V - 0.5f * A; 
        float Cr = 0.5f * R - 0.418f * V + 0.0813f * A;
        return new float[]{Y, Cb, Cr};
    }
    
    public float[] convertirRVAaYIQ(float[] rva){
        //Dos maneras de hacerlo 1.0f o hacer conversion a (float) ya que 1.0 es un double literal
        float Y = 0.299f * rva[0] + 0.587f * rva[1] + 0.114f * rva[2]; 
        float I = (float) (0.596 * rva[0] - 0.275 * rva[1] - 0.321 * rva[2]);
        float Q = 0.212f * rva[0] - 0.528f * rva[1] + 0.311f * rva[2];
        
        return new float[]{Y, I, Q};
    }
    
    public float[] convertirRVAaYCbCr(float[] rva){
        
        float Y = 0.299f * rva[0] + 0.587f * rva[1] + 0.114f * rva[2]; 
        float Cb = (float) (0.1687 * rva[0] - 0.3313 * rva[1] - 0.5 * rva[2]);
        float Cr = 0.5f * rva[0] - 0.418f * rva[1] + 0.0813f * rva[2];
        
        return new float[]{Y, Cb, Cr};
    }
    
    public float[] convertirYCbCraRVA(float[] yCbCr){
        
        float R = (1.0f * yCbCr[0] + 0f * yCbCr[1] + 1.402f * yCbCr[2]); 
        float V = (float) (1 * yCbCr[0] + 0.344 * yCbCr[1] - 0.714 * yCbCr[2]);
        float A = 1f * yCbCr[0] + 1.772f * yCbCr[1] + 0f * yCbCr[2];
        
        return new float[]{R,V,A};
    }
    
    public float[] convertirYCbCraYIQ(float[] yCbCr){
        
        //Conversion Intermedia
        float R = (1.0f * yCbCr[0] + 0f * yCbCr[1] + 1.402f * yCbCr[2]); 
        float V = (float) (1 * yCbCr[0] + 0.344 * yCbCr[1] - 0.714 * yCbCr[2]);
        float A = 1f * yCbCr[0] + 1.772f * yCbCr[1] + 0f * yCbCr[2];
        //Conversion que se pide
        float Y = 0.299f * R + 0.587f * V + 0.114f * A; 
        float I = (float) (0.596 * R - 0.275 * V - 0.321 * A);
        float Q = 0.212f * R - 0.528f * V + 0.311f * A;
        
        return new float[]{Y, I, Q};
    }
}
