import { CanActivateFn, Router } from '@angular/router';
import { AuthService } from '../services/auth/auth.service';
import { inject } from '@angular/core';

export const AuthGuard: CanActivateFn = () => {
   const authService = inject(AuthService);
   const route = inject(Router);
  if(authService.estaAutenticado()){
    return true;
  }else{
    route.navigate(['/login']);
    return false;
  }
};
