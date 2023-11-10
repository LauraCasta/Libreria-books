import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JuvenilComponent } from './juvenil.component';

describe('JuvenilComponent', () => {
  let component: JuvenilComponent;
  let fixture: ComponentFixture<JuvenilComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [JuvenilComponent]
    });
    fixture = TestBed.createComponent(JuvenilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
