package com.libreria.controller;

import com.libreria.entity.CarritoEntity;
import com.libreria.entity.CategoriaEntity;
import com.libreria.entity.LibroCarritoEntity;
import com.libreria.entity.LibrosEntity;
import com.libreria.entity.TipoDocumentoEntity;
import com.libreria.entity.TipoLibroEntity;
import com.libreria.entity.TipoUsuarioEntity;
import com.libreria.service.CarritoService;
import com.libreria.service.CategoriaService;
import com.libreria.service.DetalleFacturaService;
import com.libreria.service.FacturaService;
import com.libreria.service.InventarioService;
import com.libreria.service.LibroCarritoService;
import com.libreria.service.LibrosService;
import com.libreria.service.MedioPagoService;
import com.libreria.service.TipoDocumentoService;
import com.libreria.service.TipoLibroService;
import com.libreria.service.TipoUsuarioService;
import com.libreria.service.UsuarioService;
import com.libreria.service.VentasService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Libreria")
public class Controlador {
    @Autowired
    private TipoLibroService tipoLibroService;
    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private TipoDocumentoService tipoDocumentoService;
    @Autowired
    private TipoUsuarioService tipoUsuarioService;
    @Autowired
    private CarritoService carritoService;
    @Autowired
    private LibroCarritoService librocarritoService;
    @Autowired
    private DetalleFacturaService detalleFacturaService;
    @Autowired
    private FacturaService facturaService;
    @Autowired
    private InventarioService inventarioService;
    @Autowired
    private LibrosService librosService;
    @Autowired
    private MedioPagoService medioPagoService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private VentasService ventasService;

    // Libro 
    @Operation(
            summary = "Obtener todos los TiposLibros",
            description = "Get a TiposLibros ",
            tags = {"Libro", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de TiposLibros obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = TipoLibroEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron TiposLibros", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarTiposLibros")
    public ResponseEntity<List<TipoLibroEntity>> mostrarTpLibros() {
        List<TipoLibroEntity> listaTipoLibro = tipoLibroService.getTiposLibros();
        if (listaTipoLibro.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(listaTipoLibro);
        }
    }

    @Operation(
            summary = "Obtener todos las Categorias",
            description = "Get a Categorias ",
            tags = {"Libro", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de Categorias obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = CategoriaEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron Categorias", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarCategorias")
    public ResponseEntity<List<CategoriaEntity>> mostrarCategorias() {
        List<CategoriaEntity> categoria = categoriaService.getCategorias();
        if (categoria.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(categoria);
        }
    }

    @Operation(
            summary = "Obtener todos las Categorias",
            description = "Get a Categorias ",
            tags = {"Libro", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de Categorias obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = CategoriaEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron Categorias", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostraridCategorias/{categoria}")
    public ResponseEntity<Object> mostraridCategorias(@PathVariable("categoria") String categoria) {
        Optional<CategoriaEntity> id = categoriaService.getCatego(categoria);
        if (id.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(id.get().getIdCategoria());
        }
    }
    @Operation(
            summary = "Obtener todos los Libros",
            description = "Get a Libros ",
            tags = {"Libro", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de Libros obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = LibrosEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron Libros", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarListLibros")
    public ResponseEntity<List<LibrosEntity>> mostrarLibros() {
        List<LibrosEntity> listaLibro = librosService.getLibros();
        if (listaLibro.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(listaLibro);
        }
    }

    @Operation(
            summary = "Obtener todos los LibrosCategoria",
            description = "Get a Libros ",
            tags = {"Libro", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de Libros obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = LibrosEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron Libros", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarListLibrosCat/{categoria}")
    public ResponseEntity<List<LibrosEntity>> mostrarLibrosCategoria(@PathVariable("categoria") String categoria) {
        Optional<CategoriaEntity> codigo = categoriaService.getCatego(categoria);
        if (codigo.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            List<LibrosEntity> listaLibro = librosService.getLibroCateg(codigo.get().getIdCategoria());
            if(listaLibro.isEmpty()){
                return ResponseEntity.notFound().build();
            }else{
                return ResponseEntity.ok(listaLibro);
            }
        }
    }

    @Operation(
            summary = "Obtener un libro",
            description = "Get a Carrito ",
            tags = {"Libro", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de Carrito obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = LibrosEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron Carrito", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarLibro/{codigo}")
    public ResponseEntity<Optional<LibrosEntity>> mostrarLibro(@PathVariable("codigo") int codigo) {
        Optional<LibrosEntity> libro = librosService.getLibro(codigo);
        if (libro.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(libro);
        }
    }

    /*@Operation(
            summary = "Actualizar el producto completo",
            description = "Put producto ",
            tags = {"Carrito compras", "put"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Se ha modificado el producto", content = {@Content(schema = @Schema(implementation = CarritoEntity.class))}),
            @ApiResponse(responseCode = "404", description = "El dato no existe", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})
    })

    @PutMapping("/actualizarProducto")
    public ResponseEntity<Boolean> actualizarProducto(@RequestBody CarritoEntity producto) {
        Optional<CarritoEntity> productoId = service.getProducto(producto.getStrCodigoProducto());
        if (productoId.isPresent()) {
            service.putProducto(producto);
            return new ResponseEntity<>(true,HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }*/

    

    // Usuario 
    @Operation(
            summary = "Obtener todos los TiposDoc",
            description = "Get a TiposDoc ",
            tags = {"Usuario", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de TiposDoc obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = TipoDocumentoEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron TiposDoc", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarTiposDoc")
    public ResponseEntity<List<TipoDocumentoEntity>> mostrarTpDocs() {
        List<TipoDocumentoEntity> listDocu = tipoDocumentoService.getTiposDocs();
        if (listDocu.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(listDocu);
        }
    }
    
    @Operation(
            summary = "Obtener todos los TipoUsuario",
            description = "Get a TipoUsuario ",
            tags = {"Usuario", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de TipoUsuario obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = TipoUsuarioEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron TipoUsuario", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarTipoUsuario")
    public ResponseEntity<List<TipoUsuarioEntity>> mostrarTpUsuario() {
        List<TipoUsuarioEntity> listaTpUsuario = tipoUsuarioService.getTiposUsuarios();
        if (listaTpUsuario.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(listaTpUsuario);
        }
    }

    // carrito
    @Operation(
            summary = "Insertar Carrito",
            description = "Post Carrito ",
            tags = {"Carrito compras", "post"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Se agregaron con exito los Carrito", content = {@Content(schema = @Schema(implementation = Boolean.class))}),
            @ApiResponse(responseCode = "404", description = "No se agregaron los Carrito", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @PostMapping("/agregarLibro")
    public ResponseEntity<Boolean> agregarCarrito(@RequestBody CarritoEntity producto) {
        try {
            carritoService.postCarrito(producto);
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @Operation(
            summary = "Obtener el Carrito",
            description = "Get a Carrito ",
            tags = {"Carrito compras", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Carrito obtenido con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = CarritoEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron Carrito", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarCarrito/{codigo}")
    public ResponseEntity<CarritoEntity> mostrarCarrito(@PathVariable("codigo") int codigo) {
        CarritoEntity carrito = carritoService.getIdCarrito(codigo);
        if (carrito == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carrito);
        }
    }
    @Operation(
            summary = "Obtener items de carrito",
            description = "Get a Carrito ",
            tags = {"Carrito compras", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Carrito obtenido con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = LibroCarritoEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron Carrito", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarItems")
    public ResponseEntity<List<LibroCarritoEntity>> mostrarCarrito() {
        List<LibroCarritoEntity> listcarrito = librocarritoService.getListItem();
        if (listcarrito == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(listcarrito);
        }
    }

    @Operation(
            summary = "Eliminar un libro del carrito",
            description = "Delete libro ",
            tags = {"Carrito compras", "delete"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Se ha eliminado el carrito", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "404", description = "El carrito no existe", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @DeleteMapping("/eliminarCarrito/{codigo}")
    public ResponseEntity<Boolean> eliminarCarrito(@PathVariable("codigo") int codigo) {
        CarritoEntity carrito = carritoService.getIdCarrito(codigo);
        try {
            if(carrito != null){
                carritoService.deleteCarrito(carrito.getIdCarrito());
                return new ResponseEntity<>(true,HttpStatus.NO_CONTENT);
            }else{
                return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(
            summary = "Actualizar cantidad del carrito",
            description = "Put cantidad",
            tags = {"Carrito compras", "put"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Se ha modificado la cantidad del carrito", content = {@Content(schema = @Schema(implementation = LibroCarritoEntity.class))}),
            @ApiResponse(responseCode = "404", description = "El dato no existe", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})
    })

    @PutMapping("/actualizarCantidad/{codigo}")
    public ResponseEntity<String> actualizarCantidad(@PathVariable("codigo") int codigo,@RequestParam int cantidad) {
        Optional<LibroCarritoEntity> item = librocarritoService.getIdItem(codigo);
        if (item.isPresent()) {
            try{
                item.get().setCantidad(cantidad);
                librocarritoService.putItem(item.get());;
                return new ResponseEntity<>("Se actualizo la cantidad",HttpStatus.OK);
            }catch (Exception e){
                return new ResponseEntity<>("Error interno",HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            return new ResponseEntity<>("El producto no existe",HttpStatus.NOT_FOUND);
        }
    }
}
