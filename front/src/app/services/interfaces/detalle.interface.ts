 export  interface Detalle{
  idDetalle: number,
  idFactura: {
    idFactura: number,
    fechaCompra?: Date,
    numeroFactura: string,
    totalCompra: number,
    idMedioPago: {
      idMedioPago: number,
      medioPago: string
    },
    direccion: string,
    idUsuario: {
      idUsuario: number,
      nombre: string,
      apellido: string,
      correo: string,
      idTipoDocumento: {
        idTipoDocumento: number,
        tipoDocumento: string,
        descripcionDocumento: string
      },
      numeroDocumento: string,
      idTipoUsuario: {
        idTipoUsuario: number,
        tipoUsuario: string
      },
      celular: string,
      sesion: boolean,
      contrase: string,
      nomUsuario: string
    }
  },
  idCarrito: {
    idCarrito: number,
    total: number
  }
 }
