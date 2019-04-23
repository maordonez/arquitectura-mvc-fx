package co.edu.ufps.app.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_serie")
	private Long idProducto;
	
	@Column(name="nombreproducto")
	private String nombre;
	
	private String proveedor;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	@Column(name="preciounidad")
	private Integer precioUnidad;
	
	@Column(name="cantidadexistente")
	private Integer cantidadExistente;

}
