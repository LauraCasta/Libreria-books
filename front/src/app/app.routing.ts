import { RouterModule, Routes } from "@angular/router";
import { LoginComponent } from "./components/login/login.component";
import { RegistroComponent } from "./components/registro/registro.component";
import { LandingPageComponent } from "./components/landing-page/landing-page.component";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { AuthGuard } from "./guards/auth.guard";
import { NgModule } from "@angular/core";
import { ComicsComponent } from "./components/comics/comics.component";
import { JuvenilComponent } from "./components/juvenil/juvenil.component";
import { HistoryComponent } from "./components/history/history.component";
import { EducacionComponent } from "./components/educacion/educacion.component";
import { ProgramacionComponent } from "./components/programacion/programacion.component";
import { CarritoComponent } from "./components/carrito/carrito.component";
import { FacturaComponent } from "./components/factura/factura.component";
import { PagoComponent } from "./components/pago/pago.component";
import { CatalogoComponent } from "./components/catalogo/catalogo.component";

const routes: Routes = [
  { path: 'login', component: LoginComponent},
  { path: 'registro', component: RegistroComponent},
  { path: 'home', component: LandingPageComponent},
  { path: 'comics', component: ComicsComponent},
  { path: 'juvenil', component: JuvenilComponent},
  { path: 'history', component: HistoryComponent},
  { path: 'education', component: EducacionComponent},
  { path: 'programacion', component: ProgramacionComponent},
  { path: 'carrito', component: CarritoComponent},
  { path: 'catalogo', component: CatalogoComponent},
  { path: 'factura', component: FacturaComponent},
  { path: 'pago', component: PagoComponent},
  { path: 'dashboard', component: DashboardComponent, canActivate: [AuthGuard]},
  { path: '**', redirectTo:'login', pathMatch: 'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

