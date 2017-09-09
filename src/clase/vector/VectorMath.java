package clase.vector;


public class VectorMath {
	private int dimension;
	private double vector[];


	/**
	 * Constructor parametrizado
	 * @param dimension
	 * @param vector
	 */
	public VectorMath(int dimension, double[] vector) {
		this.dimension = dimension;
		this.vector = vector;
	}
	
	
	
	/**
	 * Constructor por defecto
	 */
	public VectorMath(int dimension) {
		this.dimension = dimension;
		// TODO Auto-generated constructor stub
	}




	public VectorMath productoVector(VectorMath vec){
		VectorMath aux = new VectorMath(vec.dimension);
		for(int i=0; i<vec.dimension;i++)
		{
			for( int j = 0; j < this.dimension; j++){
				aux.vector[i] = this.vector[j] * vec.vector[j];
			}
		}
		return aux;
	}
	
	public VectorMath sumaVectores(VectorMath vec){
		VectorMath aux = new VectorMath(vec.dimension);
		for(int i=0; i<vec.dimension;i++)
		{
			for( int j = 0; j < this.dimension; j++){
				aux.vector[i] = this.vector[j] + vec.vector[j];
			}
		}
		return aux;
	}
	
	public VectorMath restaVectores(VectorMath vec){
		VectorMath aux = new VectorMath(vec.dimension);
		for(int i=0; i<vec.dimension;i++)
		{
			for( int j = 0; j < this.dimension; j++){
				aux.vector[i] = this.vector[j] - vec.vector[j];
			}
		}
		return aux;
	}
	
	public VectorMath productoVector(MatrizMath mat){
		VectorMath aux = new VectorMath(this.dimension);
		if(this.dimension == mat.getFila()){
			for(int i = 0; i < mat.getColumna(); i++){
				for(int j = 0; j < mat.getFila(); j++){
					aux.vector[i] += this.vector[j] * mat.getValor(i, j);
				}
			}
		}
		return aux;
	}
	
	public VectorMath productoVector(int escalar){
		VectorMath aux = new VectorMath(this.dimension);
		for(int i = 0; i < this.dimension ; i++ ){
			aux.vector[i] *= escalar;
		}
	return aux;
	}
	
}
