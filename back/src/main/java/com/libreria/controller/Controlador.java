package com.libreria.controller;

import com.libreria.entity.CarritoEntity;
import com.libreria.entity.TipoLibroEntity;
import com.libreria.service.CarritoService;
import com.libreria.service.TipoLibroService;

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

    // Tipo Libro 
    @Operation(
            summary = "Obtener todos los TiposLibros",
            description = "Get a TiposLibros ",
            tags = {"Libro", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de TiposLibros obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = CarritoEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron TiposLibros", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarTiposLibros")
    public ResponseEntity<List<TipoLibroEntity>> mostrarProductos() {
        List<TipoLibroEntity> listaTipoLibro = tipoLibroService.getTiposLibros();
        if (listaTipoLibro.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(listaTipoLibro);
        }
    }


    /**@Operation(
            summary = "Insertar productos",
            description = "Post productos ",
            tags = {"Carrito compras", "post"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Se agregaron con exito los productos", content = {@Content(schema = @Schema(implementation = Boolean.class))}),
            @ApiResponse(responseCode = "404", description = "No se agregaron los productos", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @PostMapping("/agregarLibro")
    public ResponseEntity<Boolean> agregarProductos(@RequestBody CarritoEntity producto) {
        try {
            service.postProductos(producto);
            return new ResponseEntity<>(true,HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @Operation(
            summary = "Obtener todos los productos",
            description = "Get a productos ",
            tags = {"Carrito compras", "get"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "lista de productos obtenida con exito", content = {@Content(array = @ArraySchema(schema = @Schema(implementation = CarritoEntity.class)), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", description = "No se encontraron productos", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @GetMapping("/mostrarProductos")
    public ResponseEntity<List<CarritoEntity>> mostrarProductos() {
        List<CarritoEntity> listaProductos = service.getProductos();
        if (listaProductos.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(listaProductos);
        }
    }

    @Operation(
            summary = "Eliminar un producto del carrito",
            description = "Delete producto ",
            tags = {"Carrito compras", "delete"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Se ha eliminado el producto", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "404", description = "El producto no existe", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})})

    @DeleteMapping("/eliminarProducto/{codigo}")
    public ResponseEntity<Boolean> eliminarProducto(@PathVariable("codigo") String codigo) {
        Optional<CarritoEntity> producto = service.getProducto(codigo);
        try {
            if(producto.isPresent()) {
                service.deleteProducto(producto.get().getNumIdProducto());
                return new ResponseEntity<>(true,HttpStatus.NO_CONTENT);
            }else{
                return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(false,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Operation(
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
    }

    @Operation(
            summary = "Actualizar cantidad del producto",
            description = "Put cantidad",
            tags = {"Carrito compras", "put"})
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Se ha modificado la cantidad del producto", content = {@Content(schema = @Schema(implementation = CarritoEntity.class))}),
            @ApiResponse(responseCode = "404", description = "El dato no existe", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", description = "Error interno", content = {@Content(schema = @Schema())})
    })

    @PutMapping("/actualizarCantidad/{codigo}")
    public ResponseEntity<String> actualizarCantidad(@PathVariable("codigo") String codigo,@RequestParam int cantidad) {
        Optional<CarritoEntity> productoData = service.getProducto(codigo);
        if (productoData.isPresent()) {
            try{
                productoData.get().setNumCantidad(cantidad);
                service.putProducto(productoData.get());
                return new ResponseEntity<>("Se actualizo la cantidad",HttpStatus.OK);
            }catch (Exception e){
                return new ResponseEntity<>("Error interno",HttpStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            return new ResponseEntity<>("El producto no existe",HttpStatus.NOT_FOUND);
        }
    }*/
}
