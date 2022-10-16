�GSN    ���Z��^r5H]/*_ziV��\�JG�#22���JΖ��N�^���?P� PD�H>}/�VA2UO$롪P~�1+�н�bC�Zs�z���؋�Ɩ�hh�n�Ux�'�|*��W_��KXQ)�qh� �7�Lf��׆�y�V��N+���Ƣ�%Ĵ��Gq¯�S��Es���o6��Ar8�pd��ǩ��i@˅��l��{i/�ֲ�����2|�gc5%J�ۘ���{4��Ĭ6�[n).PL�߷���(X��/��/�JHR�@��є�SL��$�*��۷x'񸈸e���n��R^.��{�hnt�gj��7����Wg�.����n�h�f��8"*��� ��H����+�o�g����J����?ރx�S_o�?t��~���$��b$��D�)	�+��O��!lRo\��%��0���t���w>��_�||�5�R4�������P����>��m(�ˆ��Qr^�Ko�T_�1�8R-C�����H?RGBtoYIQ(vec3 RGB){
	const mat3 yiqmat = mat3(
		0.2989, 0.5870, 0.1140,
		0.5959, -0.2744, -0.3216,
		0.2115, -0.5229, 0.3�14);
	return RGB * yiqmat;
}

vec3 YIQtoRGB(vec3 YIQ){
	const mat3 rgbmat = mat3(
		1.0, 0.956, 0.6210,
		1.0, -0.2720, ~0.6474,
		1.0, -1.1060, 1.7046);
	return YIQ * rgbmat;
}

void main()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_COMP_A, S�ANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGHTNESS Q dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z, 1.0);c
}