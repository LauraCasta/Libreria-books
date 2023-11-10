import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule} from '@angular/forms'
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { HeaderComponent } from './components/header/header.component';
import { Header2Component } from './components/header2/header2.component';
import { RegistroComponent } from './components/registro/registro.component';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { AppRoutingModule } from './app.routing';
import { ComicsComponent } from './components/comics/comics.component';
import { HistoryComponent } from './components/history/history.component';
import { CatalogoComponent } from './components/catalogo/catalogo.component';
import { ProgramacionComponent } from './components/programacion/programacion.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { JuvenilComponent } from './components/juvenil/juvenil.component';
import { FacturaComponent } from './components/factura/factura.component';
import { CarritoComponent } from './components/carrito/carrito.component';
import { PagoComponent } from './components/pago/pago.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    Header2Component,
    RegistroComponent,
    LandingPageComponent,
    DashboardComponent,
    ComicsComponent,
    HistoryComponent,
    CatalogoComponent,
    ProgramacionComponent,
    EducacionComponent,
    JuvenilComponent,
    FacturaComponent,
    CarritoComponent,
    PagoComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
