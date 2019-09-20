import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Revision2Component } from './revision2.component';

describe('Revision2Component', () => {
  let component: Revision2Component;
  let fixture: ComponentFixture<Revision2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Revision2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Revision2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
