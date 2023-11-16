 export  interface Inventario{
    idInventario: number,
    idLibro: {
      idLibro: number,
      nombreLibro: string,
      idTipoLibro: {
        idTipoLibro: number,
        tipoLibro: string
      },
      idCategoria: {
        idCategoria: number,
        categoriaLibro: string
      },
      autor: string,
      numeroPagina: string,
      editorial: string,
      descripcion: string,
      fechaPublicacion: string,
      idioma: string,
      imagen: string
    },
    cantidadDisponible: number,
    valorUnidad: number
 }
